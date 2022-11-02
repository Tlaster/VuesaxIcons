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

public val BrokenGroup.Playadd: ImageVector
    get() {
        if (_playadd != null) {
            return _playadd!!
        }
        _playadd = Builder(name = "Playadd", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(23.0f, 19.0f)
                curveTo(23.0f, 19.75f, 22.79f, 20.46f, 22.42f, 21.06f)
                curveTo(22.21f, 21.42f, 21.94f, 21.74f, 21.63f, 22.0f)
                curveTo(20.93f, 22.63f, 20.01f, 23.0f, 19.0f, 23.0f)
                curveTo(17.54f, 23.0f, 16.27f, 22.22f, 15.58f, 21.06f)
                curveTo(15.21f, 20.46f, 15.0f, 19.75f, 15.0f, 19.0f)
                curveTo(15.0f, 17.74f, 15.58f, 16.61f, 16.5f, 15.88f)
                curveTo(17.19f, 15.33f, 18.06f, 15.0f, 19.0f, 15.0f)
                curveTo(21.21f, 15.0f, 23.0f, 16.79f, 23.0f, 19.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.4897f, 18.98f)
                horizontalLineTo(17.5098f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 17.52f)
                verticalLineTo(20.51f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.9707f, 2.85f)
                curveTo(9.2007f, 2.3f, 10.5707f, 2.0f, 12.0007f, 2.0f)
                curveTo(17.5207f, 2.0f, 22.0007f, 6.48f, 22.0007f, 12.0f)
                curveTo(22.0007f, 13.31f, 21.7507f, 14.57f, 21.2807f, 15.72f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 6.0f)
                curveTo(2.75f, 7.67f, 2.0f, 9.75f, 2.0f, 12.0f)
                curveTo(2.0f, 17.52f, 6.48f, 22.0f, 12.0f, 22.0f)
                curveTo(13.32f, 22.0f, 14.58f, 21.74f, 15.73f, 21.27f)
            }
        }
        .build()
        return _playadd!!
    }

private var _playadd: ImageVector? = null
