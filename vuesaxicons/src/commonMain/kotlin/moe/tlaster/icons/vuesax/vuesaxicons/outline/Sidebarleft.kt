package moe.tlaster.icons.vuesax.vuesaxicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.OutlineGroup

public val OutlineGroup.Sidebarleft: ImageVector
    get() {
        if (_sidebarleft != null) {
            return _sidebarleft!!
        }
        _sidebarleft = Builder(name = "Sidebarleft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.9707f, 22.75f)
                horizontalLineTo(8.9707f)
                curveTo(3.5407f, 22.75f, 1.2207f, 20.43f, 1.2207f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(1.2207f, 3.57f, 3.5407f, 1.25f, 8.9707f, 1.25f)
                horizontalLineTo(14.9707f)
                curveTo(20.4007f, 1.25f, 22.7207f, 3.57f, 22.7207f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(22.7207f, 20.43f, 20.4107f, 22.75f, 14.9707f, 22.75f)
                close()
                moveTo(8.9707f, 2.75f)
                curveTo(4.3607f, 2.75f, 2.7207f, 4.39f, 2.7207f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(2.7207f, 19.61f, 4.3607f, 21.25f, 8.9707f, 21.25f)
                horizontalLineTo(14.9707f)
                curveTo(19.5807f, 21.25f, 21.2207f, 19.61f, 21.2207f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(21.2207f, 4.39f, 19.5807f, 2.75f, 14.9707f, 2.75f)
                horizontalLineTo(8.9707f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.9707f, 22.75f)
                curveTo(7.5607f, 22.75f, 7.2207f, 22.41f, 7.2207f, 22.0f)
                verticalLineTo(2.0f)
                curveTo(7.2207f, 1.59f, 7.5607f, 1.25f, 7.9707f, 1.25f)
                curveTo(8.3807f, 1.25f, 8.7207f, 1.59f, 8.7207f, 2.0f)
                verticalLineTo(22.0f)
                curveTo(8.7207f, 22.41f, 8.3907f, 22.75f, 7.9707f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.9696f, 15.3099f)
                curveTo(14.7796f, 15.3099f, 14.5896f, 15.2399f, 14.4396f, 15.0899f)
                lineTo(11.8796f, 12.5299f)
                curveTo(11.5896f, 12.2399f, 11.5896f, 11.7599f, 11.8796f, 11.4699f)
                lineTo(14.4396f, 8.9099f)
                curveTo(14.7296f, 8.6199f, 15.2096f, 8.6199f, 15.4996f, 8.9099f)
                curveTo(15.7896f, 9.1999f, 15.7896f, 9.6799f, 15.4996f, 9.9699f)
                lineTo(13.4796f, 11.9999f)
                lineTo(15.5096f, 14.0299f)
                curveTo(15.7996f, 14.3199f, 15.7996f, 14.7999f, 15.5096f, 15.0899f)
                curveTo(15.3596f, 15.2399f, 15.1696f, 15.3099f, 14.9696f, 15.3099f)
                close()
            }
        }
        .build()
        return _sidebarleft!!
    }

private var _sidebarleft: ImageVector? = null
