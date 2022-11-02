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

public val BulkGroup.Microphone: ImageVector
    get() {
        if (_microphone != null) {
            return _microphone!!
        }
        _microphone = Builder(name = "Microphone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.9996f, 21.9302f)
                curveTo(6.9596f, 21.9302f, 2.8496f, 17.8302f, 2.8496f, 12.7802f)
                verticalLineTo(10.9002f)
                curveTo(2.8496f, 10.5102f, 3.1696f, 10.2002f, 3.5496f, 10.2002f)
                curveTo(3.9296f, 10.2002f, 4.2496f, 10.5202f, 4.2496f, 10.9002f)
                verticalLineTo(12.7802f)
                curveTo(4.2496f, 17.0502f, 7.7196f, 20.5202f, 11.9896f, 20.5202f)
                curveTo(16.2596f, 20.5202f, 19.7296f, 17.0502f, 19.7296f, 12.7802f)
                verticalLineTo(10.9002f)
                curveTo(19.7296f, 10.5102f, 20.0496f, 10.2002f, 20.4296f, 10.2002f)
                curveTo(20.8096f, 10.2002f, 21.1296f, 10.5202f, 21.1296f, 10.9002f)
                verticalLineTo(12.7802f)
                curveTo(21.1496f, 17.8302f, 17.0396f, 21.9302f, 11.9996f, 21.9302f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0004f, 2.0f)
                curveTo(8.6404f, 2.0f, 5.9004f, 4.74f, 5.9004f, 8.1f)
                verticalLineTo(12.79f)
                curveTo(5.9004f, 16.15f, 8.6404f, 18.89f, 12.0004f, 18.89f)
                curveTo(15.3604f, 18.89f, 18.1004f, 16.15f, 18.1004f, 12.79f)
                verticalLineTo(8.1f)
                curveTo(18.1004f, 4.74f, 15.3604f, 2.0f, 12.0004f, 2.0f)
                close()
                moveTo(14.1804f, 10.59f)
                curveTo(14.1104f, 10.86f, 13.8604f, 11.04f, 13.5904f, 11.04f)
                curveTo(13.5404f, 11.04f, 13.4804f, 11.03f, 13.4304f, 11.02f)
                curveTo(12.4104f, 10.74f, 11.3304f, 10.74f, 10.3104f, 11.02f)
                curveTo(9.9804f, 11.11f, 9.6504f, 10.92f, 9.5604f, 10.59f)
                curveTo(9.4704f, 10.27f, 9.6604f, 9.93f, 9.9904f, 9.84f)
                curveTo(11.2204f, 9.5f, 12.5204f, 9.5f, 13.7504f, 9.84f)
                curveTo(14.0804f, 9.93f, 14.2704f, 10.26f, 14.1804f, 10.59f)
                close()
                moveTo(15.0304f, 7.82f)
                curveTo(14.9404f, 8.07f, 14.7104f, 8.22f, 14.4604f, 8.22f)
                curveTo(14.3904f, 8.22f, 14.3204f, 8.21f, 14.2504f, 8.18f)
                curveTo(12.7204f, 7.62f, 11.0404f, 7.62f, 9.5104f, 8.18f)
                curveTo(9.1904f, 8.3f, 8.8404f, 8.14f, 8.7204f, 7.82f)
                curveTo(8.6104f, 7.51f, 8.7704f, 7.16f, 9.0904f, 7.04f)
                curveTo(10.8904f, 6.39f, 12.8704f, 6.39f, 14.6604f, 7.04f)
                curveTo(14.9804f, 7.16f, 15.1404f, 7.51f, 15.0304f, 7.82f)
                close()
            }
        }
        .build()
        return _microphone!!
    }

private var _microphone: ImageVector? = null
