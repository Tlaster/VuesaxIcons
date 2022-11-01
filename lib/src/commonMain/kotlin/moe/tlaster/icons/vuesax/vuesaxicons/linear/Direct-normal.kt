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

public val LinearGroup.`Direct-normal`: ImageVector
    get() {
        if (`_direct-normal` != null) {
            return `_direct-normal`!!
        }
        `_direct-normal` = Builder(name = "Direct-normal", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 22.0f)
                horizontalLineTo(15.0f)
                curveTo(20.0f, 22.0f, 22.0f, 20.0f, 22.0f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(22.0f, 4.0f, 20.0f, 2.0f, 15.0f, 2.0f)
                horizontalLineTo(9.0f)
                curveTo(4.0f, 2.0f, 2.0f, 4.0f, 2.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(2.0f, 20.0f, 4.0f, 22.0f, 9.0f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 13.0f)
                horizontalLineTo(5.76f)
                curveTo(6.52f, 13.0f, 7.21f, 13.43f, 7.55f, 14.11f)
                lineTo(8.44f, 15.9f)
                curveTo(9.0f, 17.0f, 10.0f, 17.0f, 10.24f, 17.0f)
                horizontalLineTo(13.77f)
                curveTo(14.53f, 17.0f, 15.22f, 16.57f, 15.56f, 15.89f)
                lineTo(16.45f, 14.1f)
                curveTo(16.79f, 13.42f, 17.48f, 12.99f, 18.24f, 12.99f)
                horizontalLineTo(21.98f)
            }
        }
        .build()
        return `_direct-normal`!!
    }

private var `_direct-normal`: ImageVector? = null
