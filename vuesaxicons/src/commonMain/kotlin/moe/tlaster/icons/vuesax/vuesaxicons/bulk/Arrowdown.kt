package moe.tlaster.icons.vuesax.vuesaxicons.bulk

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
import moe.tlaster.icons.vuesax.vuesaxicons.BulkGroup

public val BulkGroup.Arrowdown: ImageVector
    get() {
        if (_arrowdown != null) {
            return _arrowdown!!
        }
        _arrowdown = Builder(name = "Arrowdown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5295f, 11.97f)
                curveTo(15.2395f, 11.68f, 14.7595f, 11.68f, 14.4695f, 11.97f)
                lineTo(12.7495f, 13.69f)
                verticalLineTo(8.5f)
                curveTo(12.7495f, 8.09f, 12.4095f, 7.75f, 11.9995f, 7.75f)
                curveTo(11.5895f, 7.75f, 11.2495f, 8.09f, 11.2495f, 8.5f)
                verticalLineTo(13.69f)
                lineTo(9.5295f, 11.97f)
                curveTo(9.2395f, 11.68f, 8.7594f, 11.68f, 8.4694f, 11.97f)
                curveTo(8.1795f, 12.26f, 8.1795f, 12.74f, 8.4694f, 13.03f)
                lineTo(11.4695f, 16.03f)
                curveTo(11.6195f, 16.18f, 11.8095f, 16.25f, 11.9995f, 16.25f)
                curveTo(12.1895f, 16.25f, 12.3795f, 16.18f, 12.5295f, 16.03f)
                lineTo(15.5295f, 13.03f)
                curveTo(15.8195f, 12.74f, 15.8195f, 12.26f, 15.5295f, 11.97f)
                close()
            }
        }
        .build()
        return _arrowdown!!
    }

private var _arrowdown: ImageVector? = null
