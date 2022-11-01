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

public val LinearGroup.`Sms-edit`: ImageVector
    get() {
        if (`_sms-edit` != null) {
            return `_sms-edit`!!
        }
        `_sms-edit` = Builder(name = "Sms-edit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 20.5f)
                horizontalLineTo(7.0f)
                curveTo(4.0f, 20.5f, 2.0f, 19.0f, 2.0f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(2.0f, 5.0f, 4.0f, 3.5f, 7.0f, 3.5f)
                horizontalLineTo(17.0f)
                curveTo(20.0f, 3.5f, 22.0f, 5.0f, 22.0f, 8.5f)
                verticalLineTo(11.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 9.0f)
                lineTo(13.87f, 11.5f)
                curveTo(12.84f, 12.32f, 11.15f, 12.32f, 10.12f, 11.5f)
                lineTo(7.0f, 9.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.21f, 14.77f)
                lineTo(15.6701f, 18.31f)
                curveTo(15.5301f, 18.45f, 15.4f, 18.71f, 15.37f, 18.9f)
                lineTo(15.18f, 20.25f)
                curveTo(15.11f, 20.74f, 15.45f, 21.0801f, 15.94f, 21.0101f)
                lineTo(17.29f, 20.82f)
                curveTo(17.48f, 20.79f, 17.75f, 20.66f, 17.88f, 20.52f)
                lineTo(21.4201f, 16.9801f)
                curveTo(22.0301f, 16.3701f, 22.3201f, 15.6601f, 21.4201f, 14.7601f)
                curveTo(20.5301f, 13.8701f, 19.82f, 14.16f, 19.21f, 14.77f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.7001f, 15.28f)
                curveTo(19.0001f, 16.36f, 19.8401f, 17.2f, 20.9201f, 17.5f)
            }
        }
        .build()
        return `_sms-edit`!!
    }

private var `_sms-edit`: ImageVector? = null
