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

public val BrokenGroup.Mobile: ImageVector
    get() {
        if (_mobile != null) {
            return _mobile!!
        }
        _mobile = Builder(name = "Mobile", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.0f, 11.03f)
                verticalLineTo(17.0f)
                curveTo(20.0f, 21.0f, 19.0f, 22.0f, 15.0f, 22.0f)
                horizontalLineTo(9.0f)
                curveTo(5.0f, 22.0f, 4.0f, 21.0f, 4.0f, 17.0f)
                verticalLineTo(7.0f)
                curveTo(4.0f, 3.0f, 5.0f, 2.0f, 9.0f, 2.0f)
                horizontalLineTo(15.0f)
                curveTo(19.0f, 2.0f, 20.0f, 3.0f, 20.0f, 7.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 5.5f)
                horizontalLineTo(10.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.9992f, 19.1f)
                curveTo(12.8553f, 19.1f, 13.5492f, 18.406f, 13.5492f, 17.55f)
                curveTo(13.5492f, 16.694f, 12.8553f, 16.0f, 11.9992f, 16.0f)
                curveTo(11.1432f, 16.0f, 10.4492f, 16.694f, 10.4492f, 17.55f)
                curveTo(10.4492f, 18.406f, 11.1432f, 19.1f, 11.9992f, 19.1f)
                close()
            }
        }
        .build()
        return _mobile!!
    }

private var _mobile: ImageVector? = null
