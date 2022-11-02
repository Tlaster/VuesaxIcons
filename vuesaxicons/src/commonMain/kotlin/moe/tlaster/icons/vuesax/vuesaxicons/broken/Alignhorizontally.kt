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

public val BrokenGroup.Alignhorizontally: ImageVector
    get() {
        if (_alignhorizontally != null) {
            return _alignhorizontally!!
        }
        _alignhorizontally = Builder(name = "Alignhorizontally", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.75f, 17.4f)
                verticalLineTo(6.6f)
                curveTo(4.75f, 5.1f, 5.39f, 4.5f, 6.98f, 4.5f)
                horizontalLineTo(8.02f)
                curveTo(9.61f, 4.5f, 10.25f, 5.1f, 10.25f, 6.6f)
                verticalLineTo(17.4f)
                curveTo(10.25f, 18.9f, 9.61f, 19.5f, 8.02f, 19.5f)
                horizontalLineTo(6.98f)
                curveTo(5.39f, 19.5f, 4.75f, 18.9f, 4.75f, 17.4f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.75f, 15.4f)
                verticalLineTo(8.6f)
                curveTo(18.75f, 7.1f, 18.11f, 6.5f, 16.52f, 6.5f)
                horizontalLineTo(15.48f)
                curveTo(13.89f, 6.5f, 13.25f, 7.1f, 13.25f, 8.6f)
                verticalLineTo(15.4f)
                curveTo(13.25f, 16.9f, 13.89f, 17.5f, 15.48f, 17.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 12.0f)
                horizontalLineTo(4.4f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.0f, 12.0f)
                horizontalLineTo(13.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0005f, 12.0f)
                horizontalLineTo(19.3105f)
            }
        }
        .build()
        return _alignhorizontally!!
    }

private var _alignhorizontally: ImageVector? = null
