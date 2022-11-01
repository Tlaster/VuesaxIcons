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

public val LinearGroup.`Cloud-sunny`: ImageVector
    get() {
        if (`_cloud-sunny` != null) {
            return `_cloud-sunny`!!
        }
        `_cloud-sunny` = Builder(name = "Cloud-sunny", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.2699f, 18.68f)
                curveTo(19.2799f, 19.59f, 17.9799f, 20.09f, 16.6299f, 20.08f)
                horizontalLineTo(5.5399f)
                curveTo(0.8699f, 19.74f, 0.8599f, 12.94f, 5.5399f, 12.6f)
                horizontalLineTo(5.5899f)
                curveTo(2.8899f, 5.06f, 12.1199f, 1.34f, 15.9999f, 6.03f)
                verticalLineTo(6.04f)
                curveTo(16.6999f, 6.9f, 17.2299f, 8.04f, 17.4699f, 9.49f)
                curveTo(18.7999f, 9.66f, 19.8799f, 10.31f, 20.6499f, 11.23f)
                curveTo(22.3999f, 13.3f, 22.5499f, 16.68f, 20.2699f, 18.68f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.2601f, 13.01f)
                curveTo(6.7401f, 12.75f, 6.1701f, 12.61f, 5.5901f, 12.6f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.8501f, 9.92f)
                curveTo(16.3701f, 9.66f, 16.9401f, 9.52f, 17.5201f, 9.51f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.97f, 8.5f)
                curveTo(21.97f, 9.6f, 21.46f, 10.59f, 20.65f, 11.23f)
                curveTo(19.88f, 10.31f, 18.8f, 9.66f, 17.47f, 9.49f)
                curveTo(17.23f, 8.04f, 16.7f, 6.9f, 16.0f, 6.04f)
                verticalLineTo(6.03f)
                curveTo(16.63f, 5.39f, 17.51f, 5.0f, 18.47f, 5.0f)
                curveTo(20.4f, 5.0f, 21.97f, 6.57f, 21.97f, 8.5f)
                close()
            }
        }
        .build()
        return `_cloud-sunny`!!
    }

private var `_cloud-sunny`: ImageVector? = null
