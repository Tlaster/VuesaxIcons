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

public val BulkGroup.Hexhex: ImageVector
    get() {
        if (_hexhex != null) {
            return _hexhex!!
        }
        _hexhex = Builder(name = "Hexhex", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 3.3398f)
                horizontalLineTo(7.0f)
                lineTo(2.0f, 11.9998f)
                lineTo(7.0f, 20.6598f)
                horizontalLineTo(17.0f)
                lineTo(22.0f, 11.9998f)
                lineTo(17.0f, 3.3398f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.8696f, 14.0f)
                horizontalLineTo(7.0296f)
                lineTo(5.0996f, 17.33f)
                lineTo(7.0296f, 20.66f)
                horizontalLineTo(10.8696f)
                lineTo(12.7996f, 17.33f)
                lineTo(10.8696f, 14.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.6f, strokeAlpha
                    = 0.6f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.3409f, 8.0f)
                horizontalLineTo(7.0308f)
                lineTo(3.3809f, 14.33f)
                lineTo(7.0308f, 20.66f)
                horizontalLineTo(14.3409f)
                lineTo(18.0009f, 14.33f)
                lineTo(14.3409f, 8.0f)
                close()
            }
        }
        .build()
        return _hexhex!!
    }

private var _hexhex: ImageVector? = null
