package moe.tlaster.icons.vuesax.vuesaxicons.linear

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
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.Signpost: ImageVector
    get() {
        if (_signpost != null) {
            return _signpost!!
        }
        _signpost = Builder(name = "Signpost", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.22f, 2.0f)
                horizontalLineTo(8.96f)
                curveTo(8.5601f, 2.0f, 8.18f, 2.14f, 7.87f, 2.38f)
                lineTo(5.68f, 4.13f)
                curveTo(4.8f, 4.83f, 4.8f, 6.16f, 5.68f, 6.86f)
                lineTo(7.87f, 8.61f)
                curveTo(8.18f, 8.86f, 8.5701f, 8.99f, 8.96f, 8.99f)
                horizontalLineTo(17.22f)
                curveTo(18.19f, 8.99f, 18.97f, 8.21f, 18.97f, 7.24f)
                verticalLineTo(3.74f)
                curveTo(18.97f, 2.78f, 18.19f, 2.0f, 17.22f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.8f, 12.0f)
                horizontalLineTo(15.06f)
                curveTo(15.46f, 12.0f, 15.84f, 12.14f, 16.15f, 12.38f)
                lineTo(18.34f, 14.13f)
                curveTo(19.22f, 14.83f, 19.22f, 16.16f, 18.34f, 16.86f)
                lineTo(16.15f, 18.61f)
                curveTo(15.84f, 18.86f, 15.45f, 18.99f, 15.06f, 18.99f)
                horizontalLineTo(6.8f)
                curveTo(5.83f, 18.99f, 5.05f, 18.21f, 5.05f, 17.24f)
                verticalLineTo(13.74f)
                curveTo(5.05f, 12.78f, 5.83f, 12.0f, 6.8f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                verticalLineTo(9.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                verticalLineTo(19.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 22.0f)
                horizontalLineTo(15.0f)
            }
        }
        .build()
        return _signpost!!
    }

private var _signpost: ImageVector? = null
