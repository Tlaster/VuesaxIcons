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

public val LinearGroup.Cloudminus: ImageVector
    get() {
        if (_cloudminus != null) {
            return _cloudminus!!
        }
        _cloudminus = Builder(name = "Cloudminus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.97f, 20.0f)
                horizontalLineTo(8.97f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.61f, 19.9999f)
                curveTo(17.95f, 20.0099f, 19.24f, 19.5099f, 20.23f, 18.6099f)
                curveTo(23.5f, 15.7499f, 21.75f, 10.0099f, 17.44f, 9.4699f)
                curveTo(15.9f, 0.1299f, 2.43f, 3.67f, 5.62f, 12.5599f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.2801f, 12.97f)
                curveTo(6.7501f, 12.7f, 6.1601f, 12.56f, 5.5701f, 12.57f)
                curveTo(0.9101f, 12.9f, 0.9201f, 19.68f, 5.5701f, 20.01f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.8201f, 9.89f)
                curveTo(16.3401f, 9.63f, 16.9001f, 9.49f, 17.4801f, 9.48f)
            }
        }
        .build()
        return _cloudminus!!
    }

private var _cloudminus: ImageVector? = null
