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

public val BoldGroup.Export: ImageVector
    get() {
        if (_export != null) {
            return _export!!
        }
        _export = Builder(name = "Export", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.8f, 9.0f)
                horizontalLineTo(12.75f)
                verticalLineTo(15.25f)
                curveTo(12.75f, 15.66f, 12.41f, 16.0f, 12.0f, 16.0f)
                curveTo(11.59f, 16.0f, 11.25f, 15.66f, 11.25f, 15.25f)
                verticalLineTo(9.0f)
                horizontalLineTo(7.2f)
                curveTo(4.0f, 9.0f, 2.0f, 11.0f, 2.0f, 14.2f)
                verticalLineTo(16.79f)
                curveTo(2.0f, 20.0f, 4.0f, 22.0f, 7.2f, 22.0f)
                horizontalLineTo(16.79f)
                curveTo(19.99f, 22.0f, 21.99f, 20.0f, 21.99f, 16.8f)
                verticalLineTo(14.2f)
                curveTo(22.0f, 11.0f, 20.0f, 9.0f, 16.8f, 9.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.7498f, 4.5614f)
                lineTo(14.8198f, 6.6314f)
                curveTo(14.9698f, 6.7814f, 15.1598f, 6.8514f, 15.3498f, 6.8514f)
                curveTo(15.5398f, 6.8514f, 15.7298f, 6.7814f, 15.8798f, 6.6314f)
                curveTo(16.1698f, 6.3414f, 16.1698f, 5.8614f, 15.8798f, 5.5714f)
                lineTo(12.5298f, 2.2214f)
                curveTo(12.2398f, 1.9314f, 11.7598f, 1.9314f, 11.4698f, 2.2214f)
                lineTo(8.1198f, 5.5714f)
                curveTo(7.8298f, 5.8614f, 7.8298f, 6.3414f, 8.1198f, 6.6314f)
                curveTo(8.4098f, 6.9214f, 8.8898f, 6.9214f, 9.1798f, 6.6314f)
                lineTo(11.2498f, 4.5614f)
                verticalLineTo(9.0014f)
                horizontalLineTo(12.7498f)
                verticalLineTo(4.5614f)
                close()
            }
        }
        .build()
        return _export!!
    }

private var _export: ImageVector? = null
