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

public val BulkGroup.Solana: ImageVector
    get() {
        if (_solana != null) {
            return _solana!!
        }
        _solana = Builder(name = "Solana", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 0.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(24.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.9992f, 3.5f)
                horizontalLineTo(5.4992f)
                curveTo(5.1892f, 3.5f, 4.8892f, 3.65f, 4.6992f, 3.9f)
                lineTo(3.1992f, 5.9f)
                curveTo(2.7092f, 6.56f, 3.1792f, 7.5f, 3.9992f, 7.5f)
                horizontalLineTo(18.4992f)
                curveTo(18.8092f, 7.5f, 19.1092f, 7.35f, 19.2992f, 7.1f)
                lineTo(20.7992f, 5.1f)
                curveTo(21.2892f, 4.44f, 20.8192f, 3.5f, 19.9992f, 3.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.9992f, 10.0f)
                horizontalLineTo(18.4992f)
                curveTo(18.8092f, 10.0f, 19.1092f, 10.15f, 19.2992f, 10.4f)
                lineTo(20.7992f, 12.4f)
                curveTo(21.2892f, 13.06f, 20.8192f, 14.0f, 19.9992f, 14.0f)
                horizontalLineTo(5.4992f)
                curveTo(5.1892f, 14.0f, 4.8892f, 13.85f, 4.6992f, 13.6f)
                lineTo(3.1992f, 11.6f)
                curveTo(2.7092f, 10.94f, 3.1792f, 10.0f, 3.9992f, 10.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.9992f, 16.5f)
                horizontalLineTo(5.4992f)
                curveTo(5.1892f, 16.5f, 4.8892f, 16.65f, 4.6992f, 16.9f)
                lineTo(3.1992f, 18.9f)
                curveTo(2.7092f, 19.56f, 3.1792f, 20.5f, 3.9992f, 20.5f)
                horizontalLineTo(18.4992f)
                curveTo(18.8092f, 20.5f, 19.1092f, 20.35f, 19.2992f, 20.1f)
                lineTo(20.7992f, 18.1f)
                curveTo(21.2892f, 17.44f, 20.8192f, 16.5f, 19.9992f, 16.5f)
                close()
            }
        }
        .build()
        return _solana!!
    }

private var _solana: ImageVector? = null
