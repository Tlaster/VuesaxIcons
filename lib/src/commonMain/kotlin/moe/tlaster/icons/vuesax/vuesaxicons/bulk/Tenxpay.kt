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

public val BulkGroup.Tenxpay: ImageVector
    get() {
        if (_tenxpay != null) {
            return _tenxpay!!
        }
        _tenxpay = Builder(name = "Tenxpay", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, fillAlpha = 0.58f, strokeAlpha
                    = 0.58f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
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
                moveTo(12.0005f, 12.0f)
                lineTo(9.4605f, 9.46f)
                curveTo(9.0705f, 9.07f, 8.4405f, 9.07f, 8.0505f, 9.46f)
                lineTo(6.2105f, 11.3f)
                curveTo(5.8205f, 11.69f, 5.8205f, 12.32f, 6.2105f, 12.71f)
                lineTo(8.0505f, 14.55f)
                curveTo(8.4405f, 14.94f, 9.0705f, 14.94f, 9.4605f, 14.55f)
                lineTo(14.5505f, 9.46f)
                curveTo(14.9405f, 9.07f, 15.5705f, 9.07f, 15.9605f, 9.46f)
                lineTo(17.8005f, 11.3f)
                curveTo(18.1905f, 11.69f, 18.1905f, 12.32f, 17.8005f, 12.71f)
                lineTo(15.9605f, 14.55f)
                curveTo(15.5705f, 14.94f, 14.9405f, 14.94f, 14.5505f, 14.55f)
                lineTo(12.0005f, 12.0f)
                close()
            }
        }
        .build()
        return _tenxpay!!
    }

private var _tenxpay: ImageVector? = null
