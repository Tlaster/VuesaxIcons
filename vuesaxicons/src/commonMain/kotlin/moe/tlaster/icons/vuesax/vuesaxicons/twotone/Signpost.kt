package moe.tlaster.icons.vuesax.vuesaxicons.twotone

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
import moe.tlaster.icons.vuesax.vuesaxicons.TwotoneGroup

public val TwotoneGroup.Signpost: ImageVector
    get() {
        if (_signpost != null) {
            return _signpost!!
        }
        _signpost = Builder(name = "Signpost", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.2195f, 2.0f)
                horizontalLineTo(8.9596f)
                curveTo(8.5596f, 2.0f, 8.1795f, 2.14f, 7.8695f, 2.38f)
                lineTo(5.6795f, 4.13f)
                curveTo(4.7995f, 4.83f, 4.7995f, 6.16f, 5.6795f, 6.86f)
                lineTo(7.8695f, 8.61f)
                curveTo(8.1795f, 8.86f, 8.5696f, 8.99f, 8.9596f, 8.99f)
                horizontalLineTo(17.2195f)
                curveTo(18.1895f, 8.99f, 18.9695f, 8.21f, 18.9695f, 7.24f)
                verticalLineTo(3.74f)
                curveTo(18.9695f, 2.78f, 18.1895f, 2.0f, 17.2195f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.8008f, 12.0f)
                horizontalLineTo(15.0608f)
                curveTo(15.4608f, 12.0f, 15.8408f, 12.14f, 16.1508f, 12.38f)
                lineTo(18.3408f, 14.13f)
                curveTo(19.2208f, 14.83f, 19.2208f, 16.16f, 18.3408f, 16.86f)
                lineTo(16.1508f, 18.61f)
                curveTo(15.8408f, 18.86f, 15.4508f, 18.99f, 15.0608f, 18.99f)
                horizontalLineTo(6.8008f)
                curveTo(5.8308f, 18.99f, 5.0508f, 18.21f, 5.0508f, 17.24f)
                verticalLineTo(13.74f)
                curveTo(5.0508f, 12.78f, 5.8308f, 12.0f, 6.8008f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                verticalLineTo(9.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                verticalLineTo(19.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 22.0f)
                horizontalLineTo(15.0f)
            }
        }
        .build()
        return _signpost!!
    }

private var _signpost: ImageVector? = null
