package moe.tlaster.icons.vuesax.vuesaxicons.bold

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
import moe.tlaster.icons.vuesax.vuesaxicons.BoldGroup

public val BoldGroup.Tree: ImageVector
    get() {
        if (_tree != null) {
            return _tree!!
        }
        _tree = Builder(name = "Tree", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.1693f, 10.0603f)
                horizontalLineTo(7.8293f)
                curveTo(6.6493f, 10.0603f, 6.2393f, 9.2703f, 6.9293f, 8.3103f)
                lineTo(11.0993f, 2.4703f)
                curveTo(11.5893f, 1.7703f, 12.4093f, 1.7703f, 12.8993f, 2.4703f)
                lineTo(17.0693f, 8.3103f)
                curveTo(17.7593f, 9.2703f, 17.3493f, 10.0603f, 16.1693f, 10.0603f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5896f, 17.9986f)
                horizontalLineTo(6.4096f)
                curveTo(4.8296f, 17.9986f, 4.2896f, 16.9486f, 5.2196f, 15.6686f)
                lineTo(9.2096f, 10.0586f)
                horizontalLineTo(14.7896f)
                lineTo(18.7796f, 15.6686f)
                curveTo(19.7096f, 16.9486f, 19.1696f, 17.9986f, 17.5896f, 17.9986f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.75f, 18.0f)
                verticalLineTo(22.0f)
                curveTo(12.75f, 22.41f, 12.41f, 22.75f, 12.0f, 22.75f)
                curveTo(11.59f, 22.75f, 11.25f, 22.41f, 11.25f, 22.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(12.75f)
                close()
            }
        }
        .build()
        return _tree!!
    }

private var _tree: ImageVector? = null
