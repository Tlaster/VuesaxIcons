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

public val LinearGroup.`Quote-down`: ImageVector
    get() {
        if (`_quote-down` != null) {
            return `_quote-down`!!
        }
        `_quote-down` = Builder(name = "Quote-down", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.9999f, 11.65f)
                horizontalLineTo(16.1999f)
                curveTo(14.6699f, 11.65f, 13.6199f, 10.49f, 13.6199f, 9.07f)
                verticalLineTo(5.85f)
                curveTo(13.6199f, 4.43f, 14.6699f, 3.27f, 16.1999f, 3.27f)
                horizontalLineTo(19.4199f)
                curveTo(20.8399f, 3.27f, 21.9999f, 4.43f, 21.9999f, 5.85f)
                verticalLineTo(11.65f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 11.6499f)
                curveTo(22.0f, 17.6999f, 20.87f, 18.6998f, 17.47f, 20.7198f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.37f, 11.65f)
                horizontalLineTo(4.57f)
                curveTo(3.04f, 11.65f, 1.99f, 10.49f, 1.99f, 9.07f)
                verticalLineTo(5.85f)
                curveTo(1.99f, 4.43f, 3.04f, 3.27f, 4.57f, 3.27f)
                horizontalLineTo(7.8f)
                curveTo(9.22f, 3.27f, 10.38f, 4.43f, 10.38f, 5.85f)
                verticalLineTo(11.65f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.3701f, 11.6499f)
                curveTo(10.3701f, 17.6999f, 9.2401f, 18.6998f, 5.8401f, 20.7198f)
            }
        }
        .build()
        return `_quote-down`!!
    }

private var `_quote-down`: ImageVector? = null
