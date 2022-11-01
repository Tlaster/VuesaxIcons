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

public val LinearGroup.`Ticket-star`: ImageVector
    get() {
        if (`_ticket-star` != null) {
            return `_ticket-star`!!
        }
        `_ticket-star` = Builder(name = "Ticket-star", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.9949f, 4.0f)
                horizontalLineTo(6.9949f)
                curveTo(3.1649f, 4.0f, 2.0949f, 4.92f, 2.0049f, 8.5f)
                curveTo(3.9349f, 8.5f, 5.4949f, 10.07f, 5.4949f, 12.0f)
                curveTo(5.4949f, 13.93f, 3.9349f, 15.49f, 2.0049f, 15.5f)
                curveTo(2.0949f, 19.08f, 3.1649f, 20.0f, 6.9949f, 20.0f)
                horizontalLineTo(16.9949f)
                curveTo(20.9949f, 20.0f, 21.9949f, 19.0f, 21.9949f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(21.9949f, 5.0f, 20.9949f, 4.0f, 16.9949f, 4.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.9932f, 4.0f)
                verticalLineTo(7.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.9932f, 16.5f)
                verticalLineTo(20.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.025f, 9.3299f)
                lineTo(15.645f, 10.5799f)
                curveTo(15.705f, 10.6999f, 15.825f, 10.7899f, 15.955f, 10.8099f)
                lineTo(17.335f, 11.0099f)
                curveTo(17.675f, 11.0599f, 17.815f, 11.4799f, 17.565f, 11.7199f)
                lineTo(16.565f, 12.6899f)
                curveTo(16.465f, 12.7799f, 16.425f, 12.9199f, 16.445f, 13.0599f)
                lineTo(16.685f, 14.4299f)
                curveTo(16.745f, 14.7699f, 16.385f, 15.0299f, 16.085f, 14.8699f)
                lineTo(14.855f, 14.2199f)
                curveTo(14.735f, 14.1599f, 14.585f, 14.1599f, 14.465f, 14.2199f)
                lineTo(13.235f, 14.8699f)
                curveTo(12.925f, 15.0299f, 12.575f, 14.7699f, 12.635f, 14.4299f)
                lineTo(12.875f, 13.0599f)
                curveTo(12.895f, 12.9199f, 12.855f, 12.7899f, 12.755f, 12.6899f)
                lineTo(11.765f, 11.7199f)
                curveTo(11.515f, 11.4799f, 11.655f, 11.0599f, 11.995f, 11.0099f)
                lineTo(13.375f, 10.8099f)
                curveTo(13.515f, 10.7899f, 13.625f, 10.7099f, 13.685f, 10.5799f)
                lineTo(14.295f, 9.3299f)
                curveTo(14.435f, 9.0199f, 14.875f, 9.0199f, 15.025f, 9.3299f)
                close()
            }
        }
        .build()
        return `_ticket-star`!!
    }

private var `_ticket-star`: ImageVector? = null
