package moe.tlaster.icons.vuesax.vuesaxicons.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BrokenGroup

public val BrokenGroup.Like1: ImageVector
    get() {
        if (_like1 != null) {
            return _like1!!
        }
        _like1 = Builder(name = "Like1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.4805f, 11.95f)
                curveTo(21.9805f, 10.55f, 21.0805f, 9.35f, 19.5805f, 9.35f)
                horizontalLineTo(15.5805f)
                curveTo(14.9805f, 9.35f, 14.4805f, 8.85f, 14.5805f, 8.15f)
                lineTo(15.0805f, 4.95f)
                curveTo(15.2805f, 4.05f, 14.6805f, 3.05f, 13.7805f, 2.75f)
                curveTo(12.9805f, 2.45f, 11.9805f, 2.85f, 11.5805f, 3.45f)
                lineTo(7.4805f, 9.55f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.4805f, 18.35f)
                lineTo(10.5805f, 20.75f)
                curveTo(10.9805f, 21.15f, 11.8805f, 21.35f, 12.4805f, 21.35f)
                horizontalLineTo(16.2805f)
                curveTo(17.4805f, 21.35f, 18.7805f, 20.45f, 19.0805f, 19.25f)
                lineTo(20.3205f, 15.48f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.3809f, 18.35f)
                verticalLineTo(8.55f)
                curveTo(2.3809f, 7.15f, 2.9809f, 6.65f, 4.3809f, 6.65f)
                horizontalLineTo(5.3809f)
                curveTo(6.7809f, 6.65f, 7.3809f, 7.15f, 7.3809f, 8.55f)
                verticalLineTo(18.35f)
                curveTo(7.3809f, 19.75f, 6.7809f, 20.25f, 5.3809f, 20.25f)
                horizontalLineTo(4.3809f)
                curveTo(2.9809f, 20.25f, 2.3809f, 19.75f, 2.3809f, 18.35f)
                close()
            }
        }
        .build()
        return _like1!!
    }

private var _like1: ImageVector? = null
