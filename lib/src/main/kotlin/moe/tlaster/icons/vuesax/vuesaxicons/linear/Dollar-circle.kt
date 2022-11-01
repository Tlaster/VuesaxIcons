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

public val LinearGroup.`Dollar-circle`: ImageVector
    get() {
        if (`_dollar-circle` != null) {
            return `_dollar-circle`!!
        }
        `_dollar-circle` = Builder(name = "Dollar-circle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.6719f, 14.3298f)
                curveTo(8.6719f, 15.6198f, 9.6619f, 16.6598f, 10.8919f, 16.6598f)
                horizontalLineTo(13.4019f)
                curveTo(14.4719f, 16.6598f, 15.3419f, 15.7498f, 15.3419f, 14.6298f)
                curveTo(15.3419f, 13.4098f, 14.8119f, 12.9798f, 14.0219f, 12.6998f)
                lineTo(9.9919f, 11.2998f)
                curveTo(9.2019f, 11.0198f, 8.6719f, 10.5898f, 8.6719f, 9.3698f)
                curveTo(8.6719f, 8.2498f, 9.5419f, 7.3398f, 10.6119f, 7.3398f)
                horizontalLineTo(13.1219f)
                curveTo(14.3519f, 7.3398f, 15.3419f, 8.3798f, 15.3419f, 9.6698f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 6.0f)
                verticalLineTo(18.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                close()
            }
        }
        .build()
        return `_dollar-circle`!!
    }

private var `_dollar-circle`: ImageVector? = null
